import com.light.ac.common.util.DESUtil;
import org.junit.Test;

public class DesTest {
	@Test
	public void getString(){
		String root = DESUtil.getEncryptString("tiger");
		System.out.println(root);
	}
}
