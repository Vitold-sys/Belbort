<template>
        <v-card class="my-2">
            <v-card-text primary-title>
                <i>({{ message.id }})</i> {{ message.text }}
            </v-card-text>
            <media v-if="message.link" :message="message"></media>
            <v-card-actions>
                <v-btn value="Edit" @click="edit" small>Edit</v-btn>
                           <v-btn icon @click="del" small>
                               <v-icon>delete</v-icon>
                           </v-btn>
            </v-card-actions>
        </v-card>
</template>

<script>
import Media from 'components/media/Media.vue'
    export default {
        props: ['message', 'editMessage', 'deleteMessage', 'messages'],
        components: { Media},
        methods: {
            edit() {
                this.editMessage(this.message)
            },
            del() {
                this.deleteMessage(this.message)
            }
        }
    }
</script>

<style>
</style>