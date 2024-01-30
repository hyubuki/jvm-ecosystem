package io.hyubuki.springevent.app

import io.hyubuki.springevent.app.pre.PreDomainEntity
import io.hyubuki.springevent.app.pre.PreDomainRepository
import io.hyubuki.springevent.app.pre.PreDomainRequestDto
import io.hyubuki.springevent.app.pre.PreDomainService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class SpringAppController(
    private val preDomainService: PreDomainService,
    private val preDomainRepository: PreDomainRepository
) {

    @PostMapping("/generate-event")
    fun generateEvent(@RequestBody request: PreDomainRequestDto) {

        preDomainService.execute(request.id, request.percent, request.ex)
    }

    @GetMapping("/events")
    fun getAllEntities(): List<PreDomainEntity> {

        return preDomainRepository.findAll()
    }
}