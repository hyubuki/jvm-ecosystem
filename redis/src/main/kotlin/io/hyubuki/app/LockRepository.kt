package io.hyubuki.app


interface LockRepository : ExtendedCrudRepository<Lock, String> {

/*
    fun findByIdOrNull(id: String): Lock? {
        val bb: Optional<Lock> = findById(id)
        return bb.getOrNull()
    }
*/
}