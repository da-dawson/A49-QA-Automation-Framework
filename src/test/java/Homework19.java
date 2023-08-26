import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist() throws InterruptedException {
        String expectedPlayListDeletedMessage = "Deleted playlist \"Homework18.\"";
        navigateToPage();
        enterEmail("dominica.dawson@testpro.io");
        enterPassword("te$t$tudent");
        clickSubmit();
        choosePlayList();
        clickDeletePlaylistBtn();
        Thread.sleep(2000);
        playlistIsDeleted();
    }

    private void choosePlayList() throws InterruptedException {
        WebElement playListElement = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        playListElement.click();
        Thread.sleep(2000);
    }
    private void clickDeletePlaylistBtn() {
        WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deletePlaylist.click();
    }
    private void playlistIsDeleted() {
        WebElement playlistDeletedMsg = driver.findElement(By.xpath("//*[contains(text(),'Deleted playlist')]"));
        Assert.assertTrue(playlistDeletedMsg.isDisplayed());
    }

}
