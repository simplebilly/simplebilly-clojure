(ns simple-billy-api.specs.contact-history-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.customer-communication :refer :all]
            )
  (:import (java.io File)))


(def contact-history-response-data
  {
   (ds/req :contactId) string?
   (ds/req :inboundCount) int?
   (ds/req :items) (s/coll-of customer-communication-spec)
   (ds/req :outboundCount) int?
   })

(def contact-history-response-spec
  (ds/spec
    {:name ::contact-history-response
     :spec contact-history-response-data}))
