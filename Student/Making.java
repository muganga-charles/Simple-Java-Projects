package Student;
public class Making {
    private String ownerName;
    private String accessNumber;
    private String phoneNumber;
    private String registrationNumber;
    private String sign,course;
    private int year, semister;


    public Making(){
        ownerName = "Unknown";
        accessNumber = "Unknown";
        phoneNumber = "Unknown";
        registrationNumber = "Unknown";
        sign = "Unknown";
        course = "Unknown";
        year = 0;
        semister = 0;
    }

    public String getName(){//accessors
        return ownerName;
    }
    public String getCourse(){//accessors
        return course;
    }
    private int getYear(){//accessors
        return year;
    }
    public int getSem(){//accessors
        return semister;
    }

    public String getAccessNumber(){
        return accessNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getSignature(){
        return sign;
    }

    public void setCredentials(String Name, String AccessNumber, String PhoneNumber, String registration, String signature, String courseName, int Year, int Semister){
        ownerName = Name;
        accessNumber = AccessNumber;
        phoneNumber = PhoneNumber;
        registrationNumber = registration;
        year = Year;
        semister = Semister;
        sign = signature;
        course = courseName;
    }

    public String displayCredentials(){
        return "\n Name : " + getName()+ "\n Signature: " + getSignature() + "\n Reg No. : " + getRegistrationNumber() +"\n Access No. : " + getAccessNumber()+ "\n Course :"+getCourse()+"\n Year of study:(i.e 1,2 or 3) :"+ getYear() + "\n Semister : "+ getSem() +"\n Students' Tel No : " + getPhoneNumber() + "\n" ;
    }
    
}
