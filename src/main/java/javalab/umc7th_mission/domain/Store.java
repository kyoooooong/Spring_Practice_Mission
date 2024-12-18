package javalab.umc7th_mission.domain;
import jakarta.persistence.*;
import lombok.*;

import javalab.umc7th_mission.domain.enums.Gender;
import javalab.umc7th_mission.domain.enums.MemberStatus;
import javalab.umc7th_mission.domain.enums.SocialType;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String address;

    @Column(nullable = false)
    private Float score;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    @OneToMany(mappedBy = "store", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Review> reviews = new ArrayList<>();
}
