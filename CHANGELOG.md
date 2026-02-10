# Changelog

## 0.19.0 (2026-02-10)

Full Changelog: [v0.18.0...v0.19.0](https://github.com/cjavdev/spotted-java/compare/v0.18.0...v0.19.0)

### Features

* **api:** api update ([89f8772](https://github.com/cjavdev/spotted-java/commit/89f877223411e3f19ccd5d5848e59e94abc7bff8))

## 0.18.0 (2026-02-08)

Full Changelog: [v0.17.2...v0.18.0](https://github.com/cjavdev/spotted-java/compare/v0.17.2...v0.18.0)

### Features

* **api:** api update ([2b43722](https://github.com/cjavdev/spotted-java/commit/2b4372274c56bacaef19a0ab046f0be1a05ba4a6))


### Chores

* **internal:** allow passing args to `./scripts/test` ([f3728b6](https://github.com/cjavdev/spotted-java/commit/f3728b6cfd0731b0fb268f90e7b44e680b3c2341))
* **internal:** upgrade AssertJ ([81945b3](https://github.com/cjavdev/spotted-java/commit/81945b3248a414265b396c870bdbebee29ee6b12))

## 0.17.2 (2026-01-29)

Full Changelog: [v0.17.1...v0.17.2](https://github.com/cjavdev/spotted-java/compare/v0.17.1...v0.17.2)

### Bug Fixes

* **docs:** fix mcp installation instructions for remote servers ([5a2d593](https://github.com/cjavdev/spotted-java/commit/5a2d59320ee7f7ba659b5964c28045e6a5068e3c))


### Chores

* **ci:** upgrade `actions/github-script` ([2a075b1](https://github.com/cjavdev/spotted-java/commit/2a075b1665a9806ccd8e4b02b4ee760485f506fc))

## 0.17.1 (2026-01-23)

Full Changelog: [v0.17.0...v0.17.1](https://github.com/cjavdev/spotted-java/compare/v0.17.0...v0.17.1)

### Bug Fixes

* **client:** preserve time zone in lenient date-time parsing ([a2f1e0e](https://github.com/cjavdev/spotted-java/commit/a2f1e0e856dbc43760a1bfd74c331e8d40946573))


### Chores

* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([8c9e566](https://github.com/cjavdev/spotted-java/commit/8c9e566f0a03d9bd47aef395598409eadc783dc7))

## 0.17.0 (2026-01-22)

Full Changelog: [v0.16.2...v0.17.0](https://github.com/cjavdev/spotted-java/compare/v0.16.2...v0.17.0)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([b5902ef](https://github.com/cjavdev/spotted-java/commit/b5902efcfbe55984d45b7234d4ee04c9facbf28a))


### Chores

* **internal:** update maven repo doc to include authentication ([f25d93a](https://github.com/cjavdev/spotted-java/commit/f25d93aee442dfe4416300cd1f210e3a07493c49))

## 0.16.2 (2026-01-17)

Full Changelog: [v0.16.1...v0.16.2](https://github.com/cjavdev/spotted-java/compare/v0.16.1...v0.16.2)

### Bug Fixes

* **client:** fully respect max retries ([9b1a513](https://github.com/cjavdev/spotted-java/commit/9b1a513a71298dd885575344a6dbc1927708c423))
* **client:** send retry count header for max retries 0 ([9b1a513](https://github.com/cjavdev/spotted-java/commit/9b1a513a71298dd885575344a6dbc1927708c423))


### Chores

* **ci:** upgrade `actions/setup-java` ([3f26d00](https://github.com/cjavdev/spotted-java/commit/3f26d00d222513946a2d6f611cbd4fabf8e578e7))
* **internal:** depend on packages directly in example ([9b1a513](https://github.com/cjavdev/spotted-java/commit/9b1a513a71298dd885575344a6dbc1927708c423))
* **internal:** update `actions/checkout` version ([3163aa2](https://github.com/cjavdev/spotted-java/commit/3163aa26162da0e70533092318c81bbebba754df))

## 0.16.1 (2026-01-17)

Full Changelog: [v0.16.0...v0.16.1](https://github.com/cjavdev/spotted-java/compare/v0.16.0...v0.16.1)

### Bug Fixes

* **client:** disallow coercion from float to int ([3ac5055](https://github.com/cjavdev/spotted-java/commit/3ac505510657ce07fcf3416d41b870fc10cae501))
* date time deserialization leniency ([3277c9b](https://github.com/cjavdev/spotted-java/commit/3277c9b5cf1b4df4ae588b5e6ec658866042d377))


### Chores

* **internal:** clean up maven repo artifact script and add html documentation to repo root ([d940488](https://github.com/cjavdev/spotted-java/commit/d940488f8219d5c0bb62be99c6a3016af56e06c2))
* **internal:** improve maven repo docs ([10e72e8](https://github.com/cjavdev/spotted-java/commit/10e72e80c756bdc5d55325faf59178494986697e))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/cjavdev/spotted-java/issues/3240) in tests ([3277c9b](https://github.com/cjavdev/spotted-java/commit/3277c9b5cf1b4df4ae588b5e6ec658866042d377))

## 0.16.0 (2026-01-15)

Full Changelog: [v0.15.0...v0.16.0](https://github.com/cjavdev/spotted-java/compare/v0.15.0...v0.16.0)

### Features

* **api:** manual updates ([cf4837e](https://github.com/cjavdev/spotted-java/commit/cf4837ed70ffc9c06fcfd5b25b2b54ff211c9633))
* **api:** manual updates ([59ae7dd](https://github.com/cjavdev/spotted-java/commit/59ae7dda9b8877b9aea42c78019e2f163d292a00))
* **api:** turn off oauth ([59c2a6b](https://github.com/cjavdev/spotted-java/commit/59c2a6b079b292b3da5c65a51d45e4dde7847a3f))


### Chores

* remove custom code ([7e3131d](https://github.com/cjavdev/spotted-java/commit/7e3131dfa2079260a6fb3229f2f85ad57f5eb53e))

## 0.15.0 (2026-01-14)

Full Changelog: [v0.14.0...v0.15.0](https://github.com/cjavdev/spotted-java/compare/v0.14.0...v0.15.0)

### Features

* **api:** api update ([76aaea6](https://github.com/cjavdev/spotted-java/commit/76aaea637575a1b4f9237cc2cc78e610da06bb48))


### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([ee3c19c](https://github.com/cjavdev/spotted-java/commit/ee3c19cc878b4204733f66cde367a54bb7bf64f4))

## 0.14.0 (2026-01-09)

Full Changelog: [v0.13.0...v0.14.0](https://github.com/cjavdev/spotted-java/compare/v0.13.0...v0.14.0)

### Features

* **client:** allow configuring dispatcher executor service ([5190d0b](https://github.com/cjavdev/spotted-java/commit/5190d0bdd854ac4ffdc8942816de0b2cced8a1e8))

## 0.13.0 (2026-01-06)

Full Changelog: [v0.12.0...v0.13.0](https://github.com/cjavdev/spotted-java/compare/v0.12.0...v0.13.0)

### Features

* **api:** manual updates ([1eb7699](https://github.com/cjavdev/spotted-java/commit/1eb7699e6ef230a093f3517fb3ccf6f817776c72))
* **client:** add `HttpRequest#url()` method ([e082850](https://github.com/cjavdev/spotted-java/commit/e082850144d45edf3328ae2a96eff57deca2bd10))


### Documentation

* prominently feature MCP server setup in root SDK readmes ([aca35ea](https://github.com/cjavdev/spotted-java/commit/aca35ea764f389c60a0fe1d8afc480c58400feb9))

## 0.12.0 (2026-01-05)

Full Changelog: [v0.11.0...v0.12.0](https://github.com/cjavdev/spotted-java/compare/v0.11.0...v0.12.0)

### Features

* **api:** manual updates ([f996668](https://github.com/cjavdev/spotted-java/commit/f996668c191ad53918317b1397545696deed68cc))

## 0.11.0 (2025-12-18)

Full Changelog: [v0.10.0...v0.11.0](https://github.com/cjavdev/spotted-java/compare/v0.10.0...v0.11.0)

### Features

* **api:** manual updates ([09c391a](https://github.com/cjavdev/spotted-java/commit/09c391a773cb639781c813493721405c1ad80aeb))

## 0.10.0 (2025-12-16)

Full Changelog: [v0.9.0...v0.10.0](https://github.com/cjavdev/spotted-java/compare/v0.9.0...v0.10.0)

### Features

* **api:** manual updates ([0f3368b](https://github.com/cjavdev/spotted-java/commit/0f3368bb818c50bc6b49a293fea98ad543ae7c88))

## 0.9.0 (2025-12-16)

Full Changelog: [v0.8.0...v0.9.0](https://github.com/cjavdev/spotted-java/compare/v0.8.0...v0.9.0)

### Features

* **api:** manual updates ([7d0a0de](https://github.com/cjavdev/spotted-java/commit/7d0a0de27406d1f76dba486b9465208de8b28d2d))
* **api:** manual updates ([82be9ae](https://github.com/cjavdev/spotted-java/commit/82be9ae1704f57eb2be64578249b25a5ad660eda))

## 0.8.0 (2025-12-10)

Full Changelog: [v0.7.0...v0.8.0](https://github.com/cjavdev/spotted-java/compare/v0.7.0...v0.8.0)

### Features

* **api:** manual updates ([6bdd51e](https://github.com/cjavdev/spotted-java/commit/6bdd51e00dd113b67d6257df3924895cb4d582e1))

## 0.7.0 (2025-12-10)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/cjavdev/spotted-java/compare/v0.6.0...v0.7.0)

### Features

* **api:** manual updates ([18adeb9](https://github.com/cjavdev/spotted-java/commit/18adeb9bb2584c966ea8237ed3ce644d6888a465))
* **api:** manual updates ([d91a64f](https://github.com/cjavdev/spotted-java/commit/d91a64fa7745b4eb442a4b72022be5979d05ff9b))

## 0.6.0 (2025-12-10)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/cjavdev/spotted-java/compare/v0.5.0...v0.6.0)

### Features

* **api:** manual updates ([13eea9f](https://github.com/cjavdev/spotted-java/commit/13eea9f696132c37e3f4c76e7577d748f27046a4))

## 0.5.0 (2025-12-05)

Full Changelog: [v0.4.1...v0.5.0](https://github.com/cjavdev/spotted-java/compare/v0.4.1...v0.5.0)

### Features

* **api:** Update readme titles. ([e9add14](https://github.com/cjavdev/spotted-java/commit/e9add14d8621dd866eb0ddd4952dab3b48e70565))


### Documentation

* remove `$` for better copy-pasteabality ([2f880a6](https://github.com/cjavdev/spotted-java/commit/2f880a6a6a6ba685bbf59f636fc9fef6084d9a9f))

## 0.4.1 (2025-11-27)

Full Changelog: [v0.4.0...v0.4.1](https://github.com/cjavdev/spotted-java/compare/v0.4.0...v0.4.1)

### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([200488c](https://github.com/cjavdev/spotted-java/commit/200488c10ff09dff8b6175af3074d4726d1a96b0))

## 0.4.0 (2025-11-26)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/cjavdev/spotted-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** manual updates ([31e76a2](https://github.com/cjavdev/spotted-java/commit/31e76a207d9a66b9124cc68d027b8b31b854e329))
* **api:** manual updates ([02760f5](https://github.com/cjavdev/spotted-java/commit/02760f55e1959a91399211375706b03611d97e4f))

## 0.3.0 (2025-11-20)

Full Changelog: [v0.2.1...v0.3.0](https://github.com/cjavdev/spotted-java/compare/v0.2.1...v0.3.0)

### Features

* **api:** manual updates ([1ab98ad](https://github.com/cjavdev/spotted-java/commit/1ab98ad62bedd6bbe114f4ff21b3a00a57ffe667))
* **api:** manual updates ([04d026f](https://github.com/cjavdev/spotted-java/commit/04d026ff0a35f4e989017632d03c635dde661679))
* **api:** manual updates ([ac12594](https://github.com/cjavdev/spotted-java/commit/ac12594f2b3feda1ce234abb9a61b7e4b99956cb))
* **api:** manual updates ([8bf54bc](https://github.com/cjavdev/spotted-java/commit/8bf54bc582d86ad73ecfe05d1f5e1193a22c78e6))
* **api:** manual updates ([ad18adc](https://github.com/cjavdev/spotted-java/commit/ad18adc54d187530f26c08f4b0c5de03f44e6faf))
* **api:** manual updates ([3a645c1](https://github.com/cjavdev/spotted-java/commit/3a645c1e9cfebf5b00e962ec69f0941dca6caa53))
* **api:** rename public to published for java ([943df93](https://github.com/cjavdev/spotted-java/commit/943df9378aefcd9cc829d059cc84d3dda7323835))
* **api:** update kotlin maven config ([0612d76](https://github.com/cjavdev/spotted-java/commit/0612d767d42a8dafc33cb8b43cf0edc0f7e38636))

## 0.2.1 (2025-11-19)

Full Changelog: [v0.2.0...v0.2.1](https://github.com/cjavdev/spotted-java/compare/v0.2.0...v0.2.1)

## 0.2.0 (2025-11-19)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/cjavdev/spotted-java/compare/v0.1.0...v0.2.0)

### Features

* **api:** add portal to Stainless config for java ([03d4749](https://github.com/cjavdev/spotted-java/commit/03d474904d990a7a0d3e1ad99f1e83cd05634325))

## 0.1.0 (2025-11-19)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/cjavdev/spotted-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** add mode constants ([6bed97d](https://github.com/cjavdev/spotted-java/commit/6bed97dad82bf404f58bbef41961ae30d94559b9))
* **api:** Adds custom helper for datetime conversion ([6f8746b](https://github.com/cjavdev/spotted-java/commit/6f8746b57089aff7f7e4ddca9072c064f1d5ec51))
* **api:** manual updates ([1df8f2b](https://github.com/cjavdev/spotted-java/commit/1df8f2b71ccb278ad169d349699e36ab7428db77))
* **api:** manual updates ([73efe56](https://github.com/cjavdev/spotted-java/commit/73efe563e7e086aa06384d89fdc91239de21b0c6))
* **api:** manual updates ([2d8abd7](https://github.com/cjavdev/spotted-java/commit/2d8abd75badb360c21d5145bc55dc28d9a8f7c10))
* **api:** manual updates ([f4eb100](https://github.com/cjavdev/spotted-java/commit/f4eb1006a5955d686f7b88c9b087b75496e78607))
* **api:** manual updates ([b37b1b3](https://github.com/cjavdev/spotted-java/commit/b37b1b3c8b47277cf6e186a5bb5c142ef0be8cac))
* **api:** manual updates ([8c1b97c](https://github.com/cjavdev/spotted-java/commit/8c1b97c1dfe80670c61d3bba991dc4052b2c1c6a))
* **api:** manual updates ([855aa90](https://github.com/cjavdev/spotted-java/commit/855aa90903fc83b283356a1c89c5bb0593823f73))
* **api:** manual updates ([5b8d44a](https://github.com/cjavdev/spotted-java/commit/5b8d44aee78b230ceb083fb246fe671398978d29))
* **api:** manual updates ([3e77cc2](https://github.com/cjavdev/spotted-java/commit/3e77cc2d5e2318ad3d324ca68ff95984b33542c2))
* **api:** manual updates ([47567a0](https://github.com/cjavdev/spotted-java/commit/47567a0c96aa7095aa8cd5860f673bea3b025d81))
* **api:** manual updates ([d7e63b1](https://github.com/cjavdev/spotted-java/commit/d7e63b13796281b0cf4a4df8a4ae44516fa5aacb))
* **api:** manual updates ([5b4bab3](https://github.com/cjavdev/spotted-java/commit/5b4bab3038f51cf8475f2f938e0ce530e82fc81a))
* **api:** manual updates ([4343c2b](https://github.com/cjavdev/spotted-java/commit/4343c2bcec48d9f0de4909757eb4bd2ce7f4877b))
* **api:** manual updates ([bf25af1](https://github.com/cjavdev/spotted-java/commit/bf25af1edb7a6c3d3c7927500a314850562b9622))
* **api:** manual updates ([7238f62](https://github.com/cjavdev/spotted-java/commit/7238f62473a8cf59460c9ff86eecdac61694d7f5))


### Bug Fixes

* **client:** multi-value header serialization ([04f7502](https://github.com/cjavdev/spotted-java/commit/04f75028db2a0b39b5949f4410e8cebb07f65a6e))


### Chores

* configure new SDK language ([4ae89a0](https://github.com/cjavdev/spotted-java/commit/4ae89a0226876250e01187aeebc3cc94b7d656a7))
* update SDK settings ([82c17a5](https://github.com/cjavdev/spotted-java/commit/82c17a592f92fa7796a9ddd3dfa0a8a5573f06c8))
