package com.gilberthg.mini_project.inventory;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InventoryController {

    private final List<InventoryData> inventoryData = new ArrayList<>(List.of(
            new InventoryData(1L, "book A"),
            new InventoryData(2L, "book B")
    ));

    @GetMapping("/inventories")
    public List<InventoryData> getInventories() {
        return inventoryData;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/inventories")
    public InventoryData addInventory(@RequestBody InventoryData inventory) {
        inventoryData.add(inventory);
        return inventory;
    }

}
