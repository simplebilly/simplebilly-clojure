(ns simple-billy-api.specs.customer-communication
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.communication-channel :refer :all]
            [simple-billy-api.specs.communication-direction :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def customer-communication-data
  {
   (ds/opt :body) string?
   (ds/req :channel) communication-channel-spec
   (ds/req :contactId) string?
   (ds/opt :counterparty) string?
   (ds/req :direction) communication-direction-spec
   (ds/opt :occurredAt) inst?
   (ds/opt :subject) string?
   (ds/opt :tags) any-type-spec
   })

(def customer-communication-spec
  (ds/spec
    {:name ::customer-communication
     :spec customer-communication-data}))
