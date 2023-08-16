class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String notes;

    public Contact(String name, String phoneNumber, String email, String address, String notes) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phoneNumber + ", Email: " + email +
                "\nAddress: " + address + "\nNotes: " + notes;
    }
}
