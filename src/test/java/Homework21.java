import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework21  extends BaseTest {
    String newPlaylistName = "Homework21";

    @Test
    public void renamePlaylist() throws InterruptedException {
        String updatedPlaylistMsg = "Updated playlist \"Homework21.\"";

        navigateToPage();
        enterEmail("dominica.dawson@testpro.io");
        enterPassword("Te$t$tudent");
        clickSubmit();
        doubleClickPlaylist();
        Thread.sleep(2000);
      //  enterNewPlaylistName();
      //  Assert.assertEquals(getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);
    }

    public void doubleClickPlaylist() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        actions.doubleClick(playlistElement).perform();
    }



    public String getRenamePlaylistSuccessMsg() {
        WebElement notificationMsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
        return notificationMsg.getText();
    }
}
