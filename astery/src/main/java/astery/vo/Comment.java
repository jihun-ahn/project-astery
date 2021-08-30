package astery.vo;

@Data
@Entity
@org.hibernate.annotations.DynamicUpdate

public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
		
	@ManyToOne
	@JoinColumn(name = "userid")
	User user;
		
	@ManyToOne
	@JoinColumn(name = "postid")
	Post post;
		
	Timestamp writetime;
	String content;
	
}
