(ns simple-billy-api.specs.public-return-status-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def public-return-status-response-data
  {
   (ds/req :createdAt) inst?
   (ds/req :items) any-type-spec
   (ds/opt :notes) string?
   (ds/opt :orderNumber) string?
   (ds/req :returnNumber) string?
   (ds/req :returnOrderId) string?
   (ds/req :status) string?
   (ds/opt :updatedAt) inst?
   })

(def public-return-status-response-spec
  (ds/spec
    {:name ::public-return-status-response
     :spec public-return-status-response-data}))
