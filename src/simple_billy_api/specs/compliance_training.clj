(ns simple-billy-api.specs.compliance-training
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.training-source :refer :all]
            )
  (:import (java.io File)))


(def compliance-training-data
  {
   (ds/opt :assignable) boolean?
   (ds/opt :code) string?
   (ds/opt :createdAt) inst?
   (ds/opt :deletedAt) inst?
   (ds/opt :description) string?
   (ds/opt :id) uuid?
   (ds/opt :passScore) int?
   (ds/opt :pluginPlatform) string?
   (ds/opt :source) training-source-spec
   (ds/opt :tenantId) uuid?
   (ds/opt :title) string?
   (ds/opt :updatedAt) inst?
   (ds/opt :validityMonths) int?
   })

(def compliance-training-spec
  (ds/spec
    {:name ::compliance-training
     :spec compliance-training-data}))
