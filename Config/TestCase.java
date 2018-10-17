@Getter @Setter
@Domain("testdsl")
@Repo(Database.rep_mongodb)
@Execution.Input.Default
@Execution.Output.Default
@ToString
public class TestCase extends IdString{

	@Ignore
	private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;
    private LocalDate startDate;
}
