# Builder design Pattern

Builder design pattern Factory Pattern və Abstract Factory Pattern kimi 
creational design pattern sinifinə daxildir.

### _Builder Design Pattern niyə istifadə edək ?_
1. Əgər bizim Classımızın çoxlu fiedləri varsa məsələn 10.
   - Bu fiedlər bir neçəsi (tutalım 4 ü) mütləq şəkildə daxil edilməldir.
   - Digər fiedlər isə daxil edilədə bilər edilməyədə bilər.

Bu halda biz hər dəfə zəruri olmayan fiedləri daxil edəcəyik. 
1. Bu həm yorucudur
2. Həm də səhv etmə ehtimalı çoxdur bir fieldin yerinə digərinin qiymətin daxil edə biləri təbii ki tipi eynidirsə



### _Tətbiqi_
1. Builder desgin pattern tətbiq etmək istədiyimiz Class'ın içində Static 
Inner Class yaradacağıq(bizim nümunədə bu _**_Builder_**_ olacaq) və bu əsas Class ımızın bütün fiedlərin bura copy edəcyik. Yəni eynisi olacaq.
2. Builder olacaq Classımızın (bizim nümunədə _Builder_) 
   - Required (daxil edilməsi vacib olan) parametrləri alacaq şəkildə public constructor'u olacaq.
   - Optional (daxil edilməsi vacib olmayan) parametrlərə dəyər mənimsətmək üçün methodları olacaq. Tipi də Builder Classımızın tipində olacaq və eyni objeti retrun edəcək.
   - Ən sonda əsas classımızın(bizim nümunədə _Car_ tipində) tipində build methodumuz olacaq.
3. Əsas Classımızın (bizim nümunədə _Car_ )
   - Private constructor olacaq parametr olaraq da Buider Classın (bizim nümunədə _Builder_) alacaq.

Ümid edirəm faydalı oldu.

Mənbə : https://www.digitalocean.com/community/tutorials/builder-design-pattern-in-java