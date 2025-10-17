# Spring K8s Demo

Kotlin + Spring Boot + Gradle 기반 Kubernetes 배포 데모 프로젝트

## Features

- **Health Endpoint**: `/health` - 커스텀 헬스체크
- **Actuator**: `/actuator/health` - Spring Boot 기본 헬스체크
- **Prometheus Metrics**: `/actuator/prometheus` - 모니터링용 메트릭
- **Home**: `/` - 웰컴 메시지

## Quick Start

```bash
# 빌드
./gradlew build

# 실행
./gradlew bootRun

# 테스트
curl http://localhost:8080/health
curl http://localhost:8080/actuator/health
```

## Docker Build

```bash
./gradlew build
docker build -t spring-k8s-demo:1.0.0 .
docker run -p 8080:8080 spring-k8s-demo:1.0.0
```

## Endpoints

- `GET /` - 홈페이지
- `GET /health` - 커스텀 헬스체크
- `GET /actuator/health` - Spring Boot 헬스체크
- `GET /actuator/prometheus` - Prometheus 메트릭