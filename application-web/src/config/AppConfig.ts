class AppConfig {
    
    private API_URL = "http://localhost:"+process.env.INTEGRATION_API_PORT
    private header = {
        "app":"website"
    };

    getUrl() {
        return this.API_URL
    }

    getHeader() {
        return this.header
    }

}

export const appConfig = new AppConfig();