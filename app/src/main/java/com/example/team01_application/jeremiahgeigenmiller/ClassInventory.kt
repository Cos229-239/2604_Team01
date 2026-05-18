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
        InventoryItem(name = "Greataxe", type = "Weapon", description = "A massive two-handed axe. 1d12 slashing damage.", isStartingItem = true),
        InventoryItem(name = "Handaxe", type = "Weapon", description = "A light axe that can be thrown. 1d6 slashing damage. Range 20/60 ft.", quantity = 2, isStartingItem = true),
        InventoryItem(name = "Explorer's Pack", type = "Gear", description = "Includes a backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, and a waterskin.", isStartingItem = true),
        InventoryItem(name = "Javelin", type = "Weapon", description = "A throwing spear. 1d6 piercing damage. Range 30/120 ft.", quantity = 4, isStartingItem = true)
    )

    private fun bardItems(): List<InventoryItem> = listOf(
        InventoryItem(name = "Rapier", type = "Weapon", description = "An elegant thin blade. 1d8 piercing damage. Finesse.", isStartingItem = true),
        InventoryItem(name = "Diplomat's Pack", type = "Gear", description = "Includes a chest, 2 cases for maps and scrolls, fine clothes, a bottle of ink, an ink pen, a lamp, 2 flasks of oil, 5 sheets of paper, a vial of perfume, sealing wax, and soap.", isStartingItem = true),
        InventoryItem(name = "Lute", type = "Gear", description = "A musical instrument used as a spellcasting focus for Bards.", isStartingItem = true),
        InventoryItem(name = "Leather Armor", type = "Armor", description = "Light armor. AC 11 + Dex modifier.", isStartingItem = true),
        InventoryItem(name = "Dagger", type = "Weapon", description = "A small blade. 1d4 piercing damage. Finesse, thrown. Range 20/60 ft.", isStartingItem = true)
    )

    private fun clericItems(): List<InventoryItem> = listOf(
        InventoryItem(name = "Mace", type = "Weapon", description = "A heavy club with a metal head. 1d6 bludgeoning damage.", isStartingItem = true),
        InventoryItem(name = "Scale Mail", type = "Armor", description = "Medium armor. AC 14 + Dex modifier (max 2). Disadvantage on Stealth.", isStartingItem = true),
        InventoryItem(name = "Shield", type = "Armor", description = "Adds +2 to AC when equipped.", isStartingItem = true),
        InventoryItem(name = "Light Crossbow", type = "Weapon", description = "A ranged weapon. 1d8 piercing damage. Range 80/320 ft.", isStartingItem = true),
        InventoryItem(name = "Crossbow Bolt", type = "Gear", description = "Ammunition for the light crossbow. Stored in a quiver.", quantity = 20, isStartingItem = true),
        InventoryItem(name = "Priest's Pack", type = "Gear", description = "Includes a backpack, a blanket, 10 candles, a tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin.", isStartingItem = true),
        InventoryItem(name = "Holy Symbol", type = "Gear", description = "A sacred emblem used as a spellcasting focus for Clerics.", isStartingItem = true)
    )

    private fun druidItems(): List<InventoryItem> = listOf(
        InventoryItem(name = "Wooden Shield", type = "Armor", description = "A shield made of wood. Adds +2 to AC when equipped.", isStartingItem = true),
        InventoryItem(name = "Scimitar", type = "Weapon", description = "A curved blade. 1d6 slashing damage. Finesse, light.", isStartingItem = true),
        InventoryItem(name = "Leather Armor", type = "Armor", description = "Light armor. AC 11 + Dex modifier. Note: Druids will not wear metal armor.", isStartingItem = true),
        InventoryItem(name = "Druidic Focus", type = "Gear", description = "A sprig of mistletoe, totem, staff, or yew wand. Used as a spellcasting focus for Druids.", isStartingItem = true),
        InventoryItem(name = "Explorer's Pack", type = "Gear", description = "Includes a backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, and a waterskin.", isStartingItem = true)
    )

    private fun fighterItems(): List<InventoryItem> = listOf(
        InventoryItem(name = "Chain Mail", type = "Armor", description = "Heavy armor. AC 16. Disadvantage on Stealth. Requires Str 13.", isStartingItem = true),
        InventoryItem(name = "Longsword", type = "Weapon", description = "A versatile sword. 1d8 slashing (one-handed) or 1d10 (two-handed).", isStartingItem = true),
        InventoryItem(name = "Shield", type = "Armor", description = "Adds +2 to AC when equipped.", isStartingItem = true),
        InventoryItem(name = "Light Crossbow", type = "Weapon", description = "A ranged weapon. 1d8 piercing damage. Range 80/320 ft.", isStartingItem = true),
        InventoryItem(name = "Crossbow Bolt", type = "Gear", description = "Ammunition for the light crossbow. Stored in a quiver.", quantity = 20, isStartingItem = true),
        InventoryItem(name = "Dungeoneer's Pack", type = "Gear", description = "Includes a backpack, crowbar, hammer, 10 pitons, 10 torches, a tinderbox, 10 days of rations, a waterskin, and 50 feet of hempen rope.", isStartingItem = true)
    )

    private fun paladinItems(): List<InventoryItem> = listOf(
        InventoryItem(name = "Longsword", type = "Weapon", description = "A versatile sword. 1d8 slashing (one-handed) or 1d10 (two-handed).", isStartingItem = true),
        InventoryItem(name = "Shield", type = "Armor", description = "Adds +2 to AC when equipped.", isStartingItem = true),
        InventoryItem(name = "Chain Mail", type = "Armor", description = "Heavy armor. AC 16. Disadvantage on Stealth. Requires Str 13.", isStartingItem = true),
        InventoryItem(name = "Holy Symbol", type = "Gear", description = "A sacred emblem used as a spellcasting focus for Paladins.", isStartingItem = true),
        InventoryItem(name = "Priest's Pack", type = "Gear", description = "Includes a backpack, a blanket, 10 candles, a tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin.", isStartingItem = true)
    )
}