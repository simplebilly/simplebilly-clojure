(ns simple-billy-api.specs.compliance-training-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.training-source :refer :all]
            )
  (:import (java.io File)))


(def compliance-training-create-data
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

(def compliance-training-create-spec
  (ds/spec
    {:name ::compliance-training-create
     :spec compliance-training-create-data}))
