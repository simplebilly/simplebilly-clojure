(ns simple-billy-api.specs.support-ticket
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.support-channel-type :refer :all]
            [simple-billy-api.specs.ticket-priority :refer :all]
            [simple-billy-api.specs.support-ticket-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def support-ticket-data
  {
   (ds/opt :assignedTo) uuid?
   (ds/opt :channelId) uuid?
   (ds/opt :channelType) support-channel-type-spec
   (ds/opt :closedAt) inst?
   (ds/req :createdAt) inst?
   (ds/opt :customerEmail) string?
   (ds/opt :customerId) string?
   (ds/opt :customerName) string?
   (ds/opt :externalId) string?
   (ds/req :firstMessageAt) inst?
   (ds/req :lastMessageAt) inst?
   (ds/opt :leadId) uuid?
   (ds/req :messageCount) int?
   (ds/opt :orderRef) string?
   (ds/req :priority) ticket-priority-spec
   (ds/opt :resolution) string?
   (ds/req :status) support-ticket-status-spec
   (ds/req :subject) string?
   (ds/req :tags) any-type-spec
   (ds/req :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def support-ticket-spec
  (ds/spec
    {:name ::support-ticket
     :spec support-ticket-data}))
