import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import scalaj.http.*;

public class AllTests {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(DigestAuthTest.class, HttpBinTest.class, HttpRealWorldTest.class, HttpTest.class, OAuthTest.class);

      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		
      System.out.println(result.wasSuccessful());
      System.exit(result.getFailures().size());
   }
}

