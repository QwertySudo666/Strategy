package entity.spells

class Frostbite : Spell {
    override fun doDamage(): String {
        return "Enemy is frozen!"
    }
}