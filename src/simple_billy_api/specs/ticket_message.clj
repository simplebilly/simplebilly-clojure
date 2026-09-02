(ns simple-billy-api.specs.ticket-message
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.message-direction :refer :all]
            [simple-billy-api.specs.message-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def ticket-message-data
  {
   (ds/opt :authorEmail) string?
   (ds/opt :authorName) string?
   (ds/req :body) string?
   (ds/opt :bodyHtml) string?
   (ds/opt :channelId) uuid?
   (ds/req :createdAt) inst?
   (ds/req :direction) message-direction-spec
   (ds/opt :externalId) string?
   (ds/req :isInternal) boolean?
   (ds/req :messageType) message-type-spec
   (ds/req :metadata) any-type-spec
   (ds/req :tenantId) uuid?
   (ds/req :ticketId) uuid?
   })

(def ticket-message-spec
  (ds/spec
    {:name ::ticket-message
     :spec ticket-message-data}))
