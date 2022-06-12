package movies.spring.data.neo4j.api;

import com.alibaba.fastjson.JSONObject;
import movies.spring.data.neo4j.Affiliation.AffiliationEntity;
import movies.spring.data.neo4j.Affiliation.AffiliationService;
import movies.spring.data.neo4j.Author.AuthorEntity;
import movies.spring.data.neo4j.Author.AuthorService;
import movies.spring.data.neo4j.Cache.CacheEntity;
import movies.spring.data.neo4j.Cache.CacheService;
import movies.spring.data.neo4j.PublicationVenue.PublicationVenueEntity;
import movies.spring.data.neo4j.PublicationVenue.PublicationVenueService;
import movies.spring.data.neo4j.Subject.SubjectEntity;
import movies.spring.data.neo4j.Subject.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

@CrossOrigin
@RestController
public class FieldSearchController {
    private final SubjectService subjectService;
    private final AuthorService authorService;
    private final AffiliationService affiliationService;
    private final PublicationVenueService publicationVenueService;

    @Autowired
    private CacheService cacheService = new CacheService();

    Calendar calendar = Calendar.getInstance(); // 获取当前时间
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //时间格式

    public FieldSearchController(SubjectService subjectService, AuthorService authorService, AffiliationService affiliationService, PublicationVenueService publicationVenueService) {
        this.subjectService = subjectService;
        this.authorService = authorService;
        this.affiliationService = affiliationService;
        this.publicationVenueService = publicationVenueService;
    }

    @GetMapping("/findResearchInterest")
    public String findResearchInterest(@RequestParam("researchInterest") String researchInterest) {
        String Id=""+researchInterest;
        System.out.println(Id);
        System.out.println(cacheService.existsById(Id));
        if(!cacheService.existsById(Id)) {
            List<SubjectEntity> list=subjectService.findResearchInterest(researchInterest);
            HashMap<String,List<SubjectEntity>> hashMap = new HashMap<>();
            hashMap.put("list",list);
            JSONObject result = new JSONObject();
            result.putAll(hashMap);
            String time = formatter.format(calendar.getTime());
            CacheEntity.cacheResult cacheResult = new CacheEntity().new cacheResult(Id,time,result);
            cacheService.save(cacheResult);
        }
        JSONObject result = cacheService.findOne(Id).getResult();
        return result.toJSONString();
    }

//    @GetMapping("/findResearchInterest")
//    public List<SubjectEntity> findResearchInterest(@RequestParam("researchInterest") String researchInterest) {
//        return subjectService.findResearchInterest(researchInterest);
//    }

    @GetMapping("/findKeyAuthor")
    public String findKeyAuthor(@RequestParam("researchInterest") String researchInterest) {
        String Id=""+researchInterest+"Author";
        System.out.println(Id);
        System.out.println(cacheService.existsById(Id));
        if(!cacheService.existsById(Id)) {
            List<AuthorEntity> list=authorService.findKeyAuthor(researchInterest);
            HashMap<String,List<AuthorEntity>> hashMap = new HashMap<>();
            hashMap.put("list",list);
            JSONObject result = new JSONObject();
            result.putAll(hashMap);
            String time = formatter.format(calendar.getTime());
            CacheEntity.cacheResult cacheResult = new CacheEntity().new cacheResult(Id,time,result);
            cacheService.save(cacheResult);
        }
        JSONObject result = cacheService.findOne(Id).getResult();
        return result.toJSONString();
    }
//    @GetMapping("/findKeyAuthor")
//    public List<AuthorEntity> findKeyAuthor(@RequestParam("researchInterest") String researchInterest) {
//        return authorService.findKeyAuthor(researchInterest);
//    }

    @GetMapping("/findKeyAffiliation")
    public String findKeyAffiliation(@RequestParam("researchInterest") String researchInterest) {
        String Id=""+researchInterest+"Affiliation";
        System.out.println(Id);
        System.out.println(cacheService.existsById(Id));
        if(!cacheService.existsById(Id)) {
            List<AffiliationEntity> list=affiliationService.findKeyAffiliation(researchInterest);
            HashMap<String,List<AffiliationEntity>> hashMap = new HashMap<>();
            hashMap.put("list",list);
            JSONObject result = new JSONObject();
            result.putAll(hashMap);
            String time = formatter.format(calendar.getTime());
            CacheEntity.cacheResult cacheResult = new CacheEntity().new cacheResult(Id,time,result);
            cacheService.save(cacheResult);
        }
        JSONObject result = cacheService.findOne(Id).getResult();
        return result.toJSONString();
    }
//    @GetMapping("/findKeyAffiliation")
//    public List<AffiliationEntity> findKeyAffiliation(@RequestParam("researchInterest") String researchInterest) {
//        return affiliationService.findKeyAffiliation(researchInterest);
//    }

    @GetMapping("/findKeyVenue")
    public String findKeyVenue(@RequestParam("researchInterest") String researchInterest) {
        String Id=""+researchInterest+"Venue";
        System.out.println(Id);
        System.out.println(cacheService.existsById(Id));
        if(!cacheService.existsById(Id)) {
            List<PublicationVenueEntity> list=publicationVenueService.findKeyVenue(researchInterest);
            HashMap<String,List<PublicationVenueEntity>> hashMap = new HashMap<>();
            hashMap.put("list",list);
            JSONObject result = new JSONObject();
            result.putAll(hashMap);
            String time = formatter.format(calendar.getTime());
            CacheEntity.cacheResult cacheResult = new CacheEntity().new cacheResult(Id,time,result);
            cacheService.save(cacheResult);
        }
        JSONObject result = cacheService.findOne(Id).getResult();
        return result.toJSONString();
    }
//    @GetMapping("/findKeyVenue")
//    public List<PublicationVenueEntity> findKeyVenue(@RequestParam("researchInterest") String researchInterest) {
//        return publicationVenueService.findKeyVenue(researchInterest);
//    }

//    @GetMapping("/findKeyVenueTime")
//    public String findKeyVenueTime(@RequestParam("researchInterest") String researchInterest,@RequestParam("time") int time) {
//        String Id=""+researchInterest+"VenueTime";
//        System.out.println(Id);
//        System.out.println(cacheService.existsById(Id));
//        if(!cacheService.existsById(Id)) {
//            List<PublicationVenueEntity> list=publicationVenueService.findKeyVenueTime(researchInterest,time);
//            HashMap<String,List<PublicationVenueEntity>> hashMap = new HashMap<>();
//            JSONObject result = new JSONObject();
//            result.putAll(hashMap);
//            String thisTime = formatter.format(calendar.getTime());
//            CacheEntity.cacheResult cacheResult = new CacheEntity().new cacheResult(Id,thisTime,result);
//            cacheService.save(cacheResult);
//        }
//        JSONObject result = cacheService.findOne(Id).getResult();
//        return result.toJSONString();
//    }

    @GetMapping("/findKeyVenueTime")
    public List<PublicationVenueEntity> findKeyVenueTime (@RequestParam("researchInterest") String researchInterest,@RequestParam("time") int time) {
        return publicationVenueService.findKeyVenueTime(researchInterest,time);
    }
}
