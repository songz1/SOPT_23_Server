## 포켓몬 도감 API



### 1. 포켓몬 조회

#### 1-1. 전체 조회

| 메소드 | 경로      | 설명             |
| ------ | --------- | ---------------- |
| GET    | /pokemons | 포켓몬 전체 조회 |

#### 요청 헤더

```
Content-Type: application/json
```

#### 응답 바디

**조회 성공**

```
{
    "status" : 200,
    "message" : "모든 포켓몬 조회 성공",
    "data" : [
        {
            "p_id" : 1,
            "p_name" : "망나뇽",
            "p_photo" : null
        },
        {
       		"p_id" : 2,
            "p_name" : "잠만보",
            "p_photo" : null
        }
    ]
}
```

**조회 실패**

```
{
    "status" : 404,
    "message" : "포켓몬 조회 실패",
    "data" : null
}
```

**DB 에러**

```
{
    "status" : 600,
    "message" : "데이터베이스 에러",
    "data" : null
}
```

**INTERNAL SERVER ERROR**

```
{
    "status" : 500,
    "message" : "서버 내부 에러",
    "data" : null
}
```



#### 1-2. 특정 조회

| 메소드 | 경로                   | 설명                  |
| ------ | ---------------------- | --------------------- |
| GET    | /pokemons/{pokemonIdx} | 특정 포켓몬 정보 조회 |

#### 요청 헤더

```
Content-Type: application/json
```

#### 응답 바디

**조회 성공**

```
{
    "status" : 200,
    "message" : "포켓몬 조회 성공",
    "data" : {
        "p_id" : 1,
        "p_name" : "망나뇽",
        "p_photo" : null
	}
}
```

**조회 실패**

```
{
    "status" : 404,
    "message" : "포켓몬 조회 실패",
    "data" : null
}
```

**DB 에러**

```
{
    "status" : 600,
    "message" : "데이터베이스 에러",
    "data" : null
}
```

**INTERNAL SERVER ERROR**

```
{
    "status" : 500,
    "message" : "서버 내부 에러",
    "data" : null
}
```



------



### 2. 포켓몬 등록

| 메소드 | 경로      | 설명        |
| ------ | --------- | ----------- |
| POST   | /pokemons | 포켓몬 등록 |

#### 요청 헤더

```
Content-Type: multipart/form-data
Authorization: token
```

#### 요청 바디

```
{
    "name" : "피카추",
    "photo" : 파일
}
```

#### 응답 바디

**등록 성공**

```
{
    "status" : 201,
    "message" : "포켓몬 등록 성공",
    "data" : null
}
```

**등록 실패**

```
{
    "status" : 400,
    "message" : "포켓몬 등록 실패",
    "data" : null
}
```

**DB 에러**

```
{
    "status" : 600,
    "message" : "데이터베이스 에러",
    "data" : null
}
```

**INTERNAL SERVER ERROR**

```
{
    "status" : 500,
    "message" : "서버 내부 에러",
    "data" : null
}
```



---



### 3. 포켓몬 수정

| 메소드 | 경로                   | 설명        |
| ------ | ---------------------- | ----------- |
| PUT    | /pokemons/{pokemonIdx} | 포켓몬 수정 |

#### 요청 헤더

```
Content-Type: multipart/form-data
Authorization: token
```

#### 요청 바디

```
{
    "name" : "피카츄",
    "photo" : 파일
}
```

#### 응답 바디

**수정 성공**

```
{
    "status" : 200,
    "message" : "포켓몬 수정 성공",
    "data" : {
        "p_id" : 3,
        "p_name" : "피카츄",
        "p_photo" : "file.jpg"
    }
}
```

**수정 실패**

```
{
    "status" : 404,
    "message" : "포켓몬 수정 실패",
    "data" : null
}
```

**DB 에러**

```
{
    "status" : 600,
    "message" : "데이터베이스 에러",
    "data" : null
}
```

**INTERNAL SERVER ERROR**

```
{
    "status" : 500,
    "message" : "서버 내부 에러",
    "data" : null
}
```



---



### 3. 포켓몬 삭제

| 메소드 | 경로                   | 설명        |
| ------ | ---------------------- | ----------- |
| DELETE | /pokemons/{pokemonIdx} | 포켓몬 삭제 |

#### 요청 헤더

```
Content-Type: application/json
Authorization: token
```

#### 응답 바디

**삭제 성공**

```
{
    "status" : 204,
    "message" : "포켓몬 삭제 성공",
    "data" : null
}
```

**삭제 실패**

```
{
    "status" : 404,
    "message" : "포켓몬 삭제 실패",
    "data" : null
}
```

**DB 에러**

```
{
    "status" : 600,
    "message" : "데이터베이스 에러",
    "data" : null
}
```

**INTERNAL SERVER ERROR**

```
{
    "status" : 500,
    "message" : "서버 내부 에러",
    "data" : null
}
```

