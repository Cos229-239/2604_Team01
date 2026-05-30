package com.example.team01_application.jeremiahgeigenmiller

object ClassInventory {

    fun getStartingItems(characterClass: String): List<InventoryItem> {
        return when (characterClass.lowercase()) {
            "barbarian" -> barbarianItems()
            "bard"      -> bardItems()
            "cleric"    -> clericItems()
            "druid"     -> druidItems()
            "fighter"   -> fighterItems()
            "paladin"   -> paladinItems()
            else        -> emptyList()
        }
    }

    private fun barbarianItems(): List<InventoryItem> = listOf(
        InventoryItem(itemName = "Greataxe", description = "A massive two-handed axe. 1d12 slashing damage."),
        InventoryItem(itemName = "Handaxe", description = "A light axe that can be thrown. 1d6 slashing damage. Range 20/60 ft. x2"),
        InventoryItem(itemName = "Explorer's Pack", description = "Includes a backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, and a waterskin."),
        InventoryItem(itemName = "Javelin", description = "A throwing spear. 1d6 piercing damage. Range 30/120 ft. x4")
    )

    private fun bardItems(): List<InventoryItem> = listOf(
        InventoryItem(itemName = "Rapier", description = "An elegant thin blade. 1d8 piercing damage. Finesse."),
        InventoryItem(itemName = "Diplomat's Pack", description = "Includes a chest, 2 cases for maps and scrolls, fine clothes, a bottle of ink, an ink pen, a lamp, 2 flasks of oil, 5 sheets of paper, a vial of perfume, sealing wax, and soap."),
        InventoryItem(itemName = "Lute", description = "A musical instrument used as a spellcasting focus for Bards."),
        InventoryItem(itemName = "Leather Armor", description = "Light armor. AC 11 + Dex modifier."),
        InventoryItem(itemName = "Dagger", description = "A small blade. 1d4 piercing damage. Finesse, thrown. Range 20/60 ft.")
    )

    private fun clericItems(): List<InventoryItem> = listOf(
        InventoryItem(itemName = "Mace", description = "A heavy club with a metal head. 1d6 bludgeoning damage."),
        InventoryItem(itemName = "Scale Mail", description = "Medium armor. AC 14 + Dex modifier (max 2). Disadvantage on Stealth."),
        InventoryItem(itemName = "Shield", description = "Adds +2 to AC when equipped."),
        InventoryItem(itemName = "Light Crossbow", description = "A ranged weapon. 1d8 piercing damage. Range 80/320 ft."),
        InventoryItem(itemName = "Crossbow Bolts x20", description = "Ammunition for the light crossbow. Stored in a quiver."),
        InventoryItem(itemName = "Priest's Pack", description = "Includes a backpack, a blanket, 10 candles, a tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin."),
        InventoryItem(itemName = "Holy Symbol", description = "A sacred emblem used as a spellcasting focus for Clerics.")
    )

    private fun druidItems(): List<InventoryItem> = listOf(
        InventoryItem(itemName = "Wooden Shield", description = "A shield made of wood. Adds +2 to AC when equipped."),
        InventoryItem(itemName = "Scimitar", description = "A curved blade. 1d6 slashing damage. Finesse, light."),
        InventoryItem(itemName = "Leather Armor", description = "Light armor. AC 11 + Dex modifier. Note: Druids will not wear metal armor."),
        InventoryItem(itemName = "Druidic Focus", description = "A sprig of mistletoe, totem, staff, or yew wand. Used as a spellcasting focus for Druids."),
        InventoryItem(itemName = "Explorer's Pack", description = "Includes a backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, and a waterskin.")
    )

    private fun fighterItems(): List<InventoryItem> = listOf(
        InventoryItem(itemName = "Chain Mail", description = "Heavy armor. AC 16. Disadvantage on Stealth. Requires Str 13."),
        InventoryItem(itemName = "Longsword", description = "A versatile sword. 1d8 slashing (one-handed) or 1d10 (two-handed)."),
        InventoryItem(itemName = "Shield", description = "Adds +2 to AC when equipped."),
        InventoryItem(itemName = "Light Crossbow", description = "A ranged weapon. 1d8 piercing damage. Range 80/320 ft."),
        InventoryItem(itemName = "Crossbow Bolts x20", description = "Ammunition for the light crossbow. Stored in a quiver."),
        InventoryItem(itemName = "Dungeoneer's Pack", description = "Includes a backpack, crowbar, hammer, 10 pitons, 10 torches, a tinderbox, 10 days of rations, a waterskin, and 50 feet of hempen rope.")
    )

    private fun paladinItems(): List<InventoryItem> = listOf(
        InventoryItem(itemName = "Longsword", description = "A versatile sword. 1d8 slashing (one-handed) or 1d10 (two-handed)."),
        InventoryItem(itemName = "Shield", description = "Adds +2 to AC when equipped."),
        InventoryItem(itemName = "Chain Mail", description = "Heavy armor. AC 16. Disadvantage on Stealth. Requires Str 13."),
        InventoryItem(itemName = "Holy Symbol", description = "A sacred emblem used as a spellcasting focus for Paladins."),
        InventoryItem(itemName = "Priest's Pack", description = "Includes a backpack, a blanket, 10 candles, a tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin.")
    )
}