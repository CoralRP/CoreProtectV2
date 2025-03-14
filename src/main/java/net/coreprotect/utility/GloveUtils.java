package net.coreprotect.utility;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class GloveUtils {
    private static final NamespacedKey GLOVES_KEY = new NamespacedKey("laroc", "item");

    public static boolean haveGloves(Player player) {
        ItemStack mainHand = player.getInventory().getItemInMainHand();
        ItemStack offHand = player.getInventory().getItemInOffHand();
        String key = "police_gloves";

        return hasGlovesKeyWithValue(mainHand, key) || hasGlovesKeyWithValue(offHand, key);
    }

    private static boolean hasGlovesKeyWithValue(ItemStack item, String value) {
        if (item == null || !item.hasItemMeta()) {
            return false;
        }

        PersistentDataContainer dataContainer = item.getItemMeta().getPersistentDataContainer();
        return value.equals(dataContainer.get(GLOVES_KEY, PersistentDataType.STRING));
    }
}