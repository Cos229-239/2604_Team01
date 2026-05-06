package com.team01.dndcreogen.inventory

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

    // -----------------------------------------------------------------------
    // BARBARIAN
    // PHB: Greataxe, two handaxes, explorer's pack, four javelins
    // -----------------------------------------------------------------------
    private fun barbarianItems(): List<InventoryItem> = listOf(
        InventoryItem(
            itemName = "Greataxe",
            description = "A massive two-handed axe. 1d12 slashing damage.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Two Handaxes",
            description = "A pair of light axes that can be thrown. 1d6 slashing damage each. Range 20/60 ft.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Explorer's Pack",
            description = "Includes a backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, and a waterskin.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Four Javelins",
            description = "Throwing spears. 1d6 piercing damage. Range 30/120 ft.",
            isStartingItem = true
        )
    )

    // -----------------------------------------------------------------------
    // BARD
    // PHB: Rapier, diplomat's pack, lute (or other instrument), leather armor, dagger
    // -----------------------------------------------------------------------
    private fun bardItems(): List<InventoryItem> = listOf(
        InventoryItem(
            itemName = "Rapier",
            description = "An elegant thin blade. 1d8 piercing damage. Finesse.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Diplomat's Pack",
            description = "Includes a chest, 2 cases for maps and scrolls, fine clothes, a bottle of ink, an ink pen, a lamp, 2 flasks of oil, 5 sheets of paper, a vial of perfume, sealing wax, and soap.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Lute",
            description = "A musical instrument used as a spellcasting focus for Bards.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Leather Armor",
            description = "Light armor. AC 11 + Dex modifier.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Dagger",
            description = "A small blade. 1d4 piercing damage. Finesse, thrown. Range 20/60 ft.",
            isStartingItem = true
        )
    )

    // -----------------------------------------------------------------------
    // CLERIC
    // PHB: Mace, scale mail, shield, light crossbow + 20 bolts, priest's pack, holy symbol
    // -----------------------------------------------------------------------
    private fun clericItems(): List<InventoryItem> = listOf(
        InventoryItem(
            itemName = "Mace",
            description = "A heavy club with a metal head. 1d6 bludgeoning damage.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Scale Mail",
            description = "Medium armor. AC 14 + Dex modifier (max 2). Disadvantage on Stealth.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Shield",
            description = "Adds +2 to AC when equipped.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Light Crossbow",
            description = "A ranged weapon. 1d8 piercing damage. Range 80/320 ft. Requires ammunition.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "20 Crossbow Bolts",
            description = "Ammunition for the light crossbow. Stored in a quiver.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Priest's Pack",
            description = "Includes a backpack, a blanket, 10 candles, a tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Holy Symbol",
            description = "A sacred emblem used as a spellcasting focus for Clerics.",
            isStartingItem = true
        )
    )

    // -----------------------------------------------------------------------
    // DRUID
    // PHB: Wooden shield, scimitar, leather armor, druidic focus, explorer's pack
    // -----------------------------------------------------------------------
    private fun druidItems(): List<InventoryItem> = listOf(
        InventoryItem(
            itemName = "Wooden Shield",
            description = "A shield made of wood. Adds +2 to AC when equipped.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Scimitar",
            description = "A curved blade. 1d6 slashing damage. Finesse, light.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Leather Armor",
            description = "Light armor. AC 11 + Dex modifier. Note: Druids will not wear metal armor.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Druidic Focus",
            description = "A sprig of mistletoe, totem, staff, or yew wand. Used as a spellcasting focus for Druids.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Explorer's Pack",
            description = "Includes a backpack, bedroll, mess kit, tinderbox, 10 torches, 10 days of rations, and a waterskin.",
            isStartingItem = true
        )
    )

    // -----------------------------------------------------------------------
    // FIGHTER
    // PHB: Chain mail, martial weapon + shield, light crossbow + 20 bolts, dungeoneer's pack
    // -----------------------------------------------------------------------
    private fun fighterItems(): List<InventoryItem> = listOf(
        InventoryItem(
            itemName = "Chain Mail",
            description = "Heavy armor. AC 16. Disadvantage on Stealth. Requires Str 13.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Longsword",
            description = "A versatile sword. 1d8 slashing (one-handed) or 1d10 (two-handed).",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Shield",
            description = "Adds +2 to AC when equipped.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Light Crossbow",
            description = "A ranged weapon. 1d8 piercing damage. Range 80/320 ft.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "20 Crossbow Bolts",
            description = "Ammunition for the light crossbow. Stored in a quiver.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Dungeoneer's Pack",
            description = "Includes a backpack, crowbar, hammer, 10 pitons, 10 torches, a tinderbox, 10 days of rations, a waterskin, and 50 feet of hempen rope.",
            isStartingItem = true
        )
    )

    // -----------------------------------------------------------------------
    // PALADIN
    // PHB: Longsword, shield, chain mail, holy symbol, priest's pack
    // -----------------------------------------------------------------------
    private fun paladinItems(): List<InventoryItem> = listOf(
        InventoryItem(
            itemName = "Longsword",
            description = "A versatile sword. 1d8 slashing (one-handed) or 1d10 (two-handed).",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Shield",
            description = "Adds +2 to AC when equipped.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Chain Mail",
            description = "Heavy armor. AC 16. Disadvantage on Stealth. Requires Str 13.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Holy Symbol",
            description = "A sacred emblem used as a spellcasting focus for Paladins.",
            isStartingItem = true
        ),
        InventoryItem(
            itemName = "Priest's Pack",
            description = "Includes a backpack, a blanket, 10 candles, a tinderbox, an alms box, 2 blocks of incense, a censer, vestments, 2 days of rations, and a waterskin.",
            isStartingItem = true
        )
    )
}