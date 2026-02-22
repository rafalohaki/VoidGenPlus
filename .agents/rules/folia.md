---
trigger: always_on
---

# Project: Minecraft Folia Plugin

## Stack
- Java 21
- Folia API 1.21.11
- Build: Maven lub Gradle (Kotlin DSL)

## MCP dla tego projektu
- Nieznana klasa/metoda → fetch https://jd.papermc.io/folia/
- Zmiany między wersjami → web_search_exa "Folia API 1.21.11 changelog"
- Brak w Javadoc → crawling_exa na konkretny URL z docs

## Maven dependency
<dependency>
  <groupId>dev.folia</groupId>
  <artifactId>folia-api</artifactId>
  <version>1.21.11-R0.1-SNAPSHOT</version>
  <scope>provided</scope>
</dependency>

## Repository
<repository>
  <id>papermc</id>
  <url>https://repo.papermc.io/repository/maven-public/</url>
</repository>

## Zasady kodu
- Scheduler: WYŁĄCZNIE RegionScheduler / AsyncScheduler / EntityScheduler
- NIGDY BukkitScheduler ani Bukkit.getScheduler() – crashuje Folię
- io.papermc.paper.* zamiast org.bukkit.* gdy dostępne
- Adventure API: Component, MiniMessage – nigdy ChatColor
- Events: implement Listener, @EventHandler
- Thread-safety: nie zakładaj że kod działa na main thread
- ZERO deprecated API
- plugin.yml: folia-supported: true

## WAŻNE – agent behavior
- NEVER modify any files based on analysis alone
- Analysis = read-only report with suggestions, wait for user confirmation
- Before changing versions: verify artifact exists via crawling_exa on
  https://repo.papermc.io/repository/maven-public/ FIRST

## Cloudflare/Svelte/Astro MCP – nie używaj w tym projekcie
