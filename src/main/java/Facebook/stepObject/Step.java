package Facebook.stepObject;

import Facebook.PageObject.Page;

public class Step extends Page {
    public Step goToCeateAccont(){
        accontButton.click();
        return this;

    }
    public Step firstName(){
        firtNameInput.click();
        return this;

    }
    public Step lastName(){
        lastNameInput.click();
        return this;

    }
}
