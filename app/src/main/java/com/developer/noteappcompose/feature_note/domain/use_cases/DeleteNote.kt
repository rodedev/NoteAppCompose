package com.developer.noteappcompose.feature_note.domain.use_cases

import com.developer.noteappcompose.feature_note.domain.model.Note
import com.developer.noteappcompose.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}