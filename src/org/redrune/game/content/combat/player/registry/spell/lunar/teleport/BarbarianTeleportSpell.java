package org.redrune.game.content.combat.player.registry.spell.lunar.teleport;

import org.redrune.game.content.combat.player.registry.wrapper.magic.TeleportationSpellEvent;
import org.redrune.game.node.Location;

/**
 * @author Tyluur <itstyluur@gmail.com>
 * @since 7/28/2017
 */
public class BarbarianTeleportSpell implements TeleportationSpellEvent {
	
	@Override
	public int levelRequired() {
		return 75;
	}
	
	@Override
	public int[] runesRequired() {
		return arguments(ASTRAL_RUNE, 2, LAW_RUNE, 2, FIRE_RUNE, 3);
	}
	
	@Override
	public Location destination() {
		return new Location(2544, 3572, 0);
	}
	
	@Override
	public int spellId() {
		return 22;
	}
	
	@Override
	public double exp() {
		return 77;
	}
	
	@Override
	public MagicBook book() {
		return MagicBook.LUNARS;
	}
}
