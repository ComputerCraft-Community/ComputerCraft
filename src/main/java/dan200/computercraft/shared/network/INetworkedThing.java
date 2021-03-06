/**
 * This file is part of ComputerCraft - http://www.computercraft.info
 * Copyright Daniel Ratcliffe, 2011-2016. Do not distribute without permission.
 * Send enquiries to dratcliffe@gmail.com
 */

package dan200.computercraft.shared.network;
import net.minecraft.entity.player.EntityPlayer;

public interface INetworkedThing
{
    public void handlePacket( ComputerCraftPacket packet, EntityPlayer sender );
}
