package Facebook.stepObject;

import Facebook.PageObject.CalletyPage;

public class GallerySteps extends CalletyPage {
    public GallerySteps goToArtPage(){
        GoToArtFairsPage.click();
        return this;

    }
}
