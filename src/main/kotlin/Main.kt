import entity.Wizard
import entity.spells.FireBall
import entity.spells.Frostbite

fun main() {
    val wizard = Wizard()
    val fireBall = FireBall()
    val frostbite = Frostbite()
    println(wizard.castSpell(fireBall))
    println(wizard.castSpell(frostbite))
}