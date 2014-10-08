package dubcraft21.command;

import net.minecraftforge.client.ClientCommandHandler;
import dubcraft21.command.InfoCMD;

public class ClientCommandManager extends ClientCommandHandler {
	public ClientCommandManager() {
		this.registerCommand(new InfoCMD());
	}
}
