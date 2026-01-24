package bzblz.gen_net_app.model;

public enum FactType {
    Adoption("http://gna.bzblz/Adoption", "A fact of a person's adoption."),
    AdultChristening("http://gna.bzblz/AdultChristening", "A fact of a person's christening or baptism as an adult."),
    Amnesty("http://gna.bzblz/Amnesty", "A fact of a person's amnesty."),
    AncestralHall("http://gna.bzblz/AncestralHall", "A fact of a person's ancestral hall. An ancestral hall refers to a location where the early ancestors of the person originated. It may also refer to the name of an early ancestor. Family clans are often distinguished one from another by the ancestral hall. Clans that cannot prove direct relationships to other clans with the same surname can assume a direct relationship if they share the same ancestral hall."),
    AncestralPoem("http://gna.bzblz/AncestralPoem", "A fact of a person's ancestral poem. An ancestral poem (or generation poem) is composed of the \"generation characters\" that are to be used when choosing names for the members of different generations of an extended family. Ancestral poems are prominent in Asian countries, particularly China."),
    Apprenticeship("http://gna.bzblz/Apprenticeship", "A fact of a person's apprenticeship."),
    Arrest("http://gna.bzblz/Arrest", "A fact of a person's arrest."),
    Award("http://gna.bzblz/Award", "A fact of a person's award (medal, honor)."),
    Baptism("http://gna.bzblz/Baptism", "A fact of a person's baptism."),
    BarMitzvah("http://gna.bzblz/BarMitzvah", "A fact of a person's bar mitzvah."),
    BatMitzvah("http://gna.bzblz/BatMitzvah", "A fact of a person's bat mitzvah."),
    Birth("http://gna.bzblz/Birth", "A fact of a person's birth."),
    BirthNotice("http://gna.bzblz/BirthNotice", "A fact of a person's birth notice, such as posted in a newspaper or other publishing medium."),
    Blessing("http://gna.bzblz/Blessing", "A fact of an official blessing received by a person, such as at the hands of a clergy member or at another religious rite."),
    Branch("http://gna.bzblz/Branch", "A fact of a person's branch within an extended clan."),
    Burial("http://gna.bzblz/Burial", "A fact of the burial of a person's body after death."),
    Caste("http://gna.bzblz/Caste", "A fact of a person's caste."),
    Census("http://gna.bzblz/Census", "A fact of a person's participation in a census."),
    Christening("http://gna.bzblz/Christening", "A fact of a person's christening at birth. Note: Use AdultChristening for the christening as an adult."),
    Circumcision("http://gna.bzblz/Circumcision", "A fact of a person's circumcision."),
    Clan("http://gna.bzblz/Clan", "A fact of a person's clan."),
    Confirmation("http://gna.bzblz/Confirmation", "A fact of a person's confirmation (or other rite of initiation) in a church or religion."),
    Court("http://gna.bzblz/Court", "A fact of the appearance of a person in a court proceeding."),
    Cremation("http://gna.bzblz/Cremation", "A fact of the cremation of person's body after death."),
    Death("http://gna.bzblz/Death", "A fact of the death of a person."),
    Education("http://gna.bzblz/Education", "A fact of an education or an educational achievement (e.g., diploma, graduation, scholarship, etc.) of a person."),
    EducationEnrollment("http://gna.bzblz/EducationEnrollment", "A fact of a person's enrollment in an educational program or institution."),
    Emigration("http://gna.bzblz/Emigration", "A fact of the emigration of a person."),
    Enslavement("http://gna.bzblz/Enslavement", "A fact of the enslavement of a person."),
    Ethnicity("http://gna.bzblz/Ethnicity", "A fact of a person's ethnicity."),
    Excommunication("http://gna.bzblz/Excommunication", "A fact of a person's excommunication from a church."),
    FirstCommunion("http://gna.bzblz/FirstCommunion", "A fact of a person's first communion in a church."),
    Funeral("http://gna.bzblz/Funeral", "A fact of a person's funeral."),
    GenderChange("http://gna.bzblz/GenderChange", "A fact of a person's gender change."),
    GenerationNumber("http://gna.bzblz/GenerationNumber", "A fact of a person's generation number, indicating the number of generations the person is removed from a known \"first\" ancestor."),
    Graduation("http://gna.bzblz/Graduation", "A fact of a person's graduation from a scholastic institution."),
    Heimat("http://gna.bzblz/Heimat", "A fact of a person's heimat. \"Heimat\" refers to a person's affiliation by birth to a specific geographic place. Distinct heimaten are often useful as indicators that two persons of the same name are not likely to be closely related genealogically. In English, \"heimat\" may be described using terms like \"ancestral home\", \"homeland\", or \"place of origin\"."),
    Immigration("http://gna.bzblz/Immigration", "A fact of a person's immigration."),
    Imprisonment("http://gna.bzblz/Imprisonment", "A fact of a person's imprisonment."),
    Inquest("http://gna.bzblz/Inquest", "A legal inquest. Inquests usually only occur when there’s something suspicious about the death. Inquests might in some instances lead to a murder investigation. Most people that die have a death certificate wherein a doctor indicates the cause of death and often indicates when the decedent was last seen by that physician; these require no inquest."),
    LandTransaction("http://gna.bzblz/LandTransaction", "A fact of a land transaction enacted by a person."),
    Language("http://gna.bzblz/Language", "A fact of a language spoken by a person."),
    Living("http://gna.bzblz/Living", "A fact of a record of a person's living for a specific period. This is designed to include \"flourish\", defined to mean the time period in an adult's life where he was most productive, perhaps as a writer or member of the state assembly. It does not reflect the person's birth and death dates."),
    MaritalStatus("http://gna.bzblz/MaritalStatus", "A fact of a person's marital status."),
    Medical("http://gna.bzblz/Medical", "A fact of a person's medical record, such as for an illness or hospital stay."),
    MilitaryAward("http://gna.bzblz/MilitaryAward", "A fact of a person's military award."),
    MilitaryDischarge("http://gna.bzblz/MilitaryDischarge", "A fact of a person's military discharge."),
    MilitaryDraftRegistration("http://gna.bzblz/MilitaryDraftRegistration", "A fact of a person's registration for a military draft."),
    MilitaryInduction("http://gna.bzblz/MilitaryInduction", "A fact of a person's military induction."),
    MilitaryService("http://gna.bzblz/MilitaryService", "A fact of a person's military service."),
    Mission("http://gna.bzblz/Mission", "A fact of a person's church mission."),
    MoveFrom("http://gna.bzblz/MoveFrom", "A fact of a person's move (i.e., change of residence) from a location."),
    MoveTo("http://gna.bzblz/MoveTo", "A fact of a person's move (i.e., change of residence) to a new location."),
    MultipleBirth("http://gna.bzblz/MultipleBirth", "A fact that a person was born as part of a multiple birth (e.g., twin, triplet, etc.)."),
    NationalId("http://gna.bzblz/NationalId", "A fact of a person's national id (e.g., social security number)."),
    Nationality("http://gna.bzblz/Nationality", "A fact of a person's nationality."),
    Naturalization("http://gna.bzblz/Naturalization", "A fact of a person's naturalization (i.e., acquisition of citizenship and nationality)."),
    NumberOfChildren("http://gna.bzblz/NumberOfChildren", "A fact of the number of children of a person or relationship."),
    NumberOfMarriages("http://gna.bzblz/NumberOfMarriages", "A fact of a person's number of marriages."),
    Obituary("http://gna.bzblz/Obituary", "A fact of a person's obituary."),
    OfficialPosition("http://gna.bzblz/OfficialPosition", "A fact of a person's official (government) position."),
    Occupation("http://gna.bzblz/Occupation", "A fact of a person's occupation or employment."),
    Ordination("http://gna.bzblz/Ordination", "A fact of a person's ordination to a stewardship in a church."),
    Pardon("http://gna.bzblz/Pardon", "A fact of a person's legal pardon."),
    PhysicalDescription("http://gna.bzblz/PhysicalDescription", "A fact of a person's physical description."),
    Probate("http://gna.bzblz/Probate", "A fact of a receipt of probate of a person's property."),
    Property("http://gna.bzblz/Property", "A fact of a person's property or possessions."),
    Race("http://gna.bzblz/Race", "A fact of the declaration of a person's race, presumably in a historical document."),
    Religion("http://gna.bzblz/Religion", "A fact of a person's religion."),
    Residence("http://gna.bzblz/Residence", "A fact of a person's residence."),
    Retirement("http://gna.bzblz/Retirement", "A fact of a person's retirement."),
    Stillbirth("http://gna.bzblz/Stillbirth", "A fact of a person's stillbirth."),
    TaxAssessment("http://gna.bzblz/TaxAssessment", "A fact of a person's tax assessment."),
    Tribe("http://gna.bzblz/Tribe", "A fact of a person's tribe."),
    Will("http://gna.bzblz/Will", "A fact of a person's will."),
    Visit("http://gna.bzblz/Visit", "A fact of a person's visit to a place different from the person's residence."),
    Yahrzeit("http://gna.bzblz/Yahrzeit", "A fact of a person's yahrzeit date. A person's yahrzeit is the anniversary of their death as measured by the Hebrew calendar."),
    Annulment("http://gna.bzblz/Annulment", "The fact of an annulment of a marriage."),
    CommonLawMarriage("http://gna.bzblz/CommonLawMarriage", "The fact of a marriage by common law."),
    CivilUnion("http://gna.bzblz/CivilUnion", "The fact of a civil union of a couple."),
    Divorce("http://gna.bzblz/Divorce", "The fact of a divorce of a couple."),
    DivorceFiling("http://gna.bzblz/DivorceFiling", "The fact of a filing for divorce."),
    DomesticPartnership("http://gna.bzblz/DomesticPartnership", "The fact of a domestic partnership of a couple."),
    Engagement("http://gna.bzblz/Engagement", "The fact of an engagement to be married."),
    Marriage("http://gna.bzblz/Marriage", "The fact of a marriage."),
    MarriageBanns("http://gna.bzblz/MarriageBanns", "The fact of a marriage banns."),
    MarriageContract("http://gna.bzblz/MarriageContract", "The fact of a marriage contract."),
    MarriageLicense("http://gna.bzblz/MarriageLicense", "The fact of a marriage license."),
    MarriageNotice("http://gna.bzblz/MarriageNotice", "The fact of a marriage notice."),
    Separation("http://gna.bzblz/Separation", "A fact of a couple's separation."),
    AdoptiveParent("http://gna.bzblz/AdoptiveParent", "A fact about an adoptive relationship between a parent and a child."),
    BiologicalParent("http://gna.bzblz/BiologicalParent", "A fact about the biological relationship between a parent and a child."),
    ChildOrder("http://gna.bzblz/ChildOrder", "A fact about the child order between a parent and a child."),
    EnteringHeir("http://gna.bzblz/EnteringHeir", "A fact about an entering heir relationship between a parent and a child. An entering heir is received from another parent as an \"exiting heir\" for designation of inheritance."),
    ExitingHeir("http://gna.bzblz/ExitingHeir", "A fact about an exiting heir relationship between a parent and a child. An exiting heir is given as an \"entering heir\" to another parent for designation of inheritance."),
    FosterParent("http://gna.bzblz/FosterParent", "A fact about a foster relationship between a foster parent and a child."),
    GuardianParent("http://gna.bzblz/GuardianParent", "A fact about a legal guardianship between a parent and a child."),
    StepParent("http://gna.bzblz/StepParent", "A fact about the step relationship between a parent and a child."),
    SociologicalParent("http://gna.bzblz/SociologicalParent", "A fact about a sociological relationship between a parent and a child, but not definable in typical legal or biological terms."),
    SurrogateParent("http://gna.bzblz/SurrogateParent", "A fact about a pregnancy surrogate relationship between a parent and a child.");

    private final String uri;
    private final String description;

    FactType(String uri, String description) {
        this.uri = uri;
        this.description = description;
    }

    public String getUri() {
        return uri;
    }

    public String getDescription() {
        return description;
    }

    public static FactType fromUri(String uri) {
        for (FactType type : FactType.values()) {
            if (type.getUri().equals(uri)) {
                return type;
            }
        }
        return null;
    }
}
