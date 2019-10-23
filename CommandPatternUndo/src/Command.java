
public interface Command {
	public void execute();
	public void undo(); // 커맨드에 undo()가 추가됨
}
