(ns simple-billy-api.specs.compliance-training-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.training-source :refer :all]
            )
  (:import (java.io File)))


(def compliance-training-update-data
  {
   (ds/opt :assignable) boolean?
   (ds/opt :code) string?
   (ds/opt :description) string?
   (ds/opt :passScore) int?
   (ds/opt :pluginPlatform) string?
   (ds/opt :source) training-source-spec
   (ds/opt :title) string?
   (ds/opt :validityMonths) int?
   })

(def compliance-training-update-spec
  (ds/spec
    {:name ::compliance-training-update
     :spec compliance-training-update-data}))
