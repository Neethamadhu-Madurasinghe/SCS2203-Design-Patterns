package Proxy;

public class CommanndExecutorProxy implements CommandExecutor{
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommanndExecutorProxy(String user, String password) {
        if("admin".equals(user) && "123".equals(password)) {
            this.isAdmin = true;
        }else {
            this.isAdmin = false;
        }
        this.executor = new CommandExecutorImp();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin) {
            this.executor.runCommand(cmd);
        }else {
            if(cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not valid under normal user");
            }else {
                this.executor.runCommand(cmd);
            }
        }
    }
}
