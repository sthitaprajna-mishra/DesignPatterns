package Factory;

public class Platform {
    public void setRefreshRate() {
        System.out.println("REFRESH RATE UPDATED");
    }
    public void setTheme() {
        System.out.println("THEME UPDATED");
    }

    public UIComponentFactory createUIComponentFactory(String platform) {
        if(platform.equals("Android")) return new AndroidUIComponentFactory();
        else if(platform.equals("IOS")) return new IOSUIComponentFactory();
        return null;
    }
}

