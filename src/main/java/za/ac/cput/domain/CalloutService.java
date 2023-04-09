package za.ac.cput.domain;

//Author: Lutho Nondala (219369399)

import java.util.Date;

public class CalloutService {
    private long service_id;
    private Date date_of_callout;

    public CalloutService(){}

    public CalloutService(Builder builder){
        this.service_id = builder.service_id;
        this.date_of_callout = builder.date_of_callout;
    }

    public long getService_id() {
        return service_id;
    }

    public void setService_id(long service_id) {
        this.service_id = service_id;
    }

    public Date getDate_of_callout() {
        return date_of_callout;
    }

    public void setDate_of_callout(Date date_of_callout) {
        this.date_of_callout = date_of_callout;
    }

    public static class Builder{
        private long service_id;
        private Date date_of_callout;

        public Builder service_id(long service_id){
            this.service_id = service_id;
            return this;
        }

        public Builder date_of_callout(Date date_of_callout){
            this.date_of_callout = date_of_callout;
            return this;
        }

        public Builder copy(CalloutService calloutService){
            this.service_id = calloutService.service_id;
            this.date_of_callout = calloutService.date_of_callout;
            return this;
        }

        public CalloutService build(){
            return new CalloutService(this);
        }
    }
}
