package plugin.npc.familiar;

import plugin.skill.summoning.familiar.Familiar;
import plugin.skill.summoning.familiar.FamiliarSpecial;
import core.game.node.entity.combat.equipment.WeaponInterface;
import core.plugin.InitializablePlugin;
import core.game.node.entity.player.Player;

/**
 * Represents the Swamp Titan familiar.
 * @author Aero
 */
@InitializablePlugin
public class SwampTitanNPC extends Familiar {

	/**
	 * Constructs a new {@code SwampTitanNPC} {@code Object}.
	 */
	public SwampTitanNPC() {
		this(null, 7329);
	}

	/**
	 * Constructs a new {@code SwampTitanNPC} {@code Object}.
	 * @param owner The owner.
	 * @param id The id.
	 */
	public SwampTitanNPC(Player owner, int id) {
		super(owner, id, 5600, 12776, 6, WeaponInterface.STYLE_ACCURATE);
	}

	@Override
	public Familiar construct(Player owner, int id) {
		return new SwampTitanNPC(owner, id);
	}

	@Override
	protected boolean specialMove(FamiliarSpecial special) {
		return false;
	}

	@Override
	public int[] getIds() {
		return new int[] { 7329, 7330 };
	}

}
