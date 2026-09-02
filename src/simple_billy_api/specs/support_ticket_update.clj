(ns simple-billy-api.specs.support-ticket-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.support-channel-type :refer :all]
            [simple-billy-api.specs.ticket-priority :refer :all]
            [simple-billy-api.specs.support-ticket-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def support-ticket-update-data
  {
   (ds/opt :assignedTo) uuid?
   (ds/opt :channelId) uuid?
   (ds/opt :channelType) support-channel-type-spec
   (ds/opt :closedAt) inst?
   (ds/opt :createdAt) inst?
   (ds/opt :customerEmail) string?
   (ds/opt :customerId) string?
   (ds/opt :customerName) string?
   (ds/opt :externalId) string?
   (ds/opt :firstMessageAt) inst?
   (ds/opt :lastMessageAt) inst?
   (ds/opt :leadId) uuid?
   (ds/opt :messageCount) int?
   (ds/opt :orderRef) string?
   (ds/opt :priority) ticket-priority-spec
   (ds/opt :resolution) string?
   (ds/opt :status) support-ticket-status-spec
   (ds/opt :subject) string?
   (ds/opt :tags) any-type-spec
   (ds/opt :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def support-ticket-update-spec
  (ds/spec
    {:name ::support-ticket-update
     :spec support-ticket-update-data}))
