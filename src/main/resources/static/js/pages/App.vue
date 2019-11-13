<template>
       <v-app>
       <v-app-bar app>
                <v-toolbar-title>Belbort</v-toolbar-title>
                <div class="flex-grow-1"></div>
                <span v-if="profile">{{profile.name}}</span>
                <v-btn v-if="profile" href="/logout" icon>
                       <v-icon>E</v-icon>
               </v-btn>
        </v-app-bar app>
        <v-content>
               <v-container v-if="!profile">Need to auth with <a href="/login">Google</a>
               </v-container>
               <v-container v-if="profile">
                     <message-list :messages="messages"/>
               </v-container>
        </v-content>

        </v-app>
</template>

<script>
   import MessageList from 'components/messages/MessageList.vue'
   import { addHandler } from '../util/ws'
   import { getIndex } from '../util/collections'
export default {
         components:{
         MessageList
         },
         data() {
             return{
                messages: frontendData.messages,
                profile: frontendData.profile
             }
        },
        created(){
            addHandler(data=>{
                let index = getIndex(this.messages,data.id)
                if(index > -1){
                    this.messages.splice(index,1,data)
                }else{
                    this.messages.push(data)
                }
            })
        }
 }
</script>

<style>
</style>