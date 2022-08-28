package entity

import entity.spells.Spell

class Wizard {
    fun castSpell(spell: Spell): String {
        return spell.doDamage()
    }
}