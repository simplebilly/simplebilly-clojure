(ns simple-billy-api.specs.lead-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.lead-status :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def lead-update-data
  {
   (ds/opt :company) string?
   (ds/opt :convertedAt) inst?
   (ds/opt :createdAt) inst?
   (ds/opt :email) string?
   (ds/opt :firstContactAt) inst?
   (ds/opt :name) string?
   (ds/opt :notes) string?
   (ds/opt :phone) string?
   (ds/opt :score) int?
   (ds/opt :source) string?
   (ds/opt :status) lead-status-spec
   (ds/opt :tags) any-type-spec
   (ds/opt :tenantId) uuid?
   (ds/opt :updatedAt) inst?
   })

(def lead-update-spec
  (ds/spec
    {:name ::lead-update
     :spec lead-update-data}))
