(ns simple-billy-api.specs.lead
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.lead-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def lead-data
  {
   (ds/opt :company) string?
   (ds/opt :convertedAt) inst?
   (ds/req :createdAt) inst?
   (ds/opt :email) string?
   (ds/req :firstContactAt) inst?
   (ds/req :name) string?
   (ds/opt :notes) string?
   (ds/opt :phone) string?
   (ds/req :score) int?
   (ds/req :source) string?
   (ds/req :status) lead-status-spec
   (ds/req :tags) any-type-spec
   (ds/req :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def lead-spec
  (ds/spec
    {:name ::lead
     :spec lead-data}))
