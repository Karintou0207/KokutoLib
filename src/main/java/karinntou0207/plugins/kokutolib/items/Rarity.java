package karinntou0207.plugins.kokutolib.items;

import org.bukkit.ChatColor;

public enum Rarity {
    Common(ChatColor.AQUA + "COMMON"),
    Uncommon(ChatColor.GREEN + "UNCOMMON"),
    Rare(ChatColor.YELLOW + "RARE"),
    Epic(ChatColor.BLUE + "EPIC"),
    Legendary(ChatColor.LIGHT_PURPLE + "Legendary"),
    Mythic(ChatColor.GOLD + "MYTHIC"),
    Cursed(ChatColor.BLACK + "CURSED");

    public final String displayname;

    Rarity(String displayname){
        this.displayname = displayname;
    }
}
