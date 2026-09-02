(ns simple-billy-api.specs.recurring-template-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.execution-status :refer :all]
            [simple-billy-api.specs.recurring-template-type :refer :all]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def recurring-template-create-data
  {
   (ds/opt :endDate) inst?
   (ds/req :executionInterval) string?
   (ds/req :executionStatus) execution-status-spec
   (ds/opt :finalize) boolean?
   (ds/opt :lastExecutedAt) inst?
   (ds/req :name) string?
   (ds/opt :nextExecutionAt) inst?
   (ds/req :startDate) inst?
   (ds/req :templateType) recurring-template-type-spec
   (ds/opt :voucherData) any-type-spec
   })

(def recurring-template-create-spec
  (ds/spec
    {:name ::recurring-template-create
     :spec recurring-template-create-data}))
