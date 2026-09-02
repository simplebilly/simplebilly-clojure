(ns simple-billy-api.specs.customer-communication-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.communication-channel :refer :all]
            [simple-billy-api.specs.communication-direction :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def customer-communication-update-data
  {
   (ds/opt :body) string?
   (ds/opt :channel) communication-channel-spec
   (ds/opt :contactId) string?
   (ds/opt :counterparty) string?
   (ds/opt :direction) communication-direction-spec
   (ds/opt :occurredAt) inst?
   (ds/opt :subject) string?
   (ds/opt :tags) any-type-spec
   })

(def customer-communication-update-spec
  (ds/spec
    {:name ::customer-communication-update
     :spec customer-communication-update-data}))
